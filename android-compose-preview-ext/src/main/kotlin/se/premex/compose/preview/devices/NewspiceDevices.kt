package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * newspice device specifications for Android Compose previews.
 *
 * This extension provides newspice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newspice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newspice: Any
  get() = object {
      /** newspice Spice_F301 */
      val SPICE_F301 = "spec:width=480,height=854,unit=px,dpi=240"

      /** newspice Spice_F302 */
      val SPICE_F302 = "spec:width=480,height=854,unit=px,dpi=240"

      /** newspice Spice-F305 */
      val SPICE_F305 = "spec:width=480,height=854,unit=px,dpi=240"

      /** newspice Spice-F311 */
      val SPICE_F311 = "spec:width=480,height=960,unit=px,dpi=240"

      /** newspice Spice_K601 */
      val SPICE_K601 = "spec:width=480,height=854,unit=px,dpi=240"

      /** newspice Spice_V801 */
      val SPICE_V801 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
