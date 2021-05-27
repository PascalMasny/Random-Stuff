%# Your data
Z = [2 3 4
    8 4 10
    5 6 7];


%# the "nominal" bar (adjusted from cylinder())
n = 4;
r = [0.5; 0.5];
m = length(r);
theta = (0:n)/n*2*pi + pi/4;

sintheta = sin(theta); sintheta(end) = sqrt(2)/2;

x0 = r * cos(theta);
y0 = r * sintheta;
z0 = (0:m-1)'/(m-1) * ones(1,n+1);

%# get data for current colormap
map = colormap;
Mz = max(Z(:));
mz = min(Z(:));

% Each "bar" is 1 surf and 1 patch
for ii = 1:size(Z,1)
    for jj = 1:size(Z,2)

        % Get color (linear interpolation through current colormap)
        cI = (Z(ii,jj)-mz)*(size(map,1)-1)/(Mz-mz) + 1;
        fC = floor(cI);
        cC = ceil(cI);
        color = map(fC,:) + (map(cC,:) - map(fC,:)) * (cI-fC);

        % Translate and rescale the nominal bar
        x = x0+ii;
        y = y0+jj;
        z = z0*Z(ii,jj);

        % Draw the bar
        surf(x,y,z, 'Facecolor', color)
        patch(x(end,:), y(end,:), z(end,:), color)

    end
end
