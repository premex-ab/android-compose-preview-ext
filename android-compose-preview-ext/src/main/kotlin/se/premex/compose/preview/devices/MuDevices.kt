package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mu device specifications for Android Compose previews.
 *
 * This extension provides mu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mu: Any
  get() = object {
      /** mu mu6 */
      val MU6 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** mu mu_1 */
      val MU_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** mu 8 */
      val _8 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
