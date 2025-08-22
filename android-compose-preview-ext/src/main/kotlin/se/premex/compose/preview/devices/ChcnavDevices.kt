package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CHCNAV device specifications for Android Compose previews.
 *
 * This extension provides CHCNAV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chcnav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chcnav: Any
  get() = object {
      /** CHCNAV HCE600 */
      val HCE600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CHCNAV LT60 */
      val LT60 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** CHCNAV LT700 */
      val LT700 = "spec:width=1200,height=1920,unit=px,dpi=306"

      /** CHCNAV LT800 */
      val LT800 = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
