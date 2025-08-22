package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RAVOZ device specifications for Android Compose previews.
 *
 * This extension provides RAVOZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ravoz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ravoz: Any
  get() = object {
      /** RAVOZ RAVOZ_V2 */
      val RAVOZ_V2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_V3 */
      val RAVOZ_V3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_V5 */
      val RAVOZ_V5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_V6 */
      val RAVOZ_V6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** RAVOZ RAVOZ_V7 */
      val RAVOZ_V7 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** RAVOZ RAVOZ_V8 */
      val RAVOZ_V8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** RAVOZ RAVOZ_V9 */
      val RAVOZ_V9 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** RAVOZ RAVOZ_Z3 */
      val RAVOZ_Z3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z3_Lite */
      val RAVOZ_Z3_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z3_Pro */
      val RAVOZ_Z3_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z4 */
      val RAVOZ_Z4 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z5 */
      val RAVOZ_Z5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z5_Lite */
      val RAVOZ_Z5_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z5_Pro */
      val RAVOZ_Z5_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z6 */
      val RAVOZ_Z6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z6_Lite */
      val RAVOZ_Z6_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z6_Pro */
      val RAVOZ_Z6_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAVOZ RAVOZ_Z7 */
      val RAVOZ_Z7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** RAVOZ RAVOZ_Z7_Pro */
      val RAVOZ_Z7_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** RAVOZ RAVOZ_Z8 */
      val RAVOZ_Z8 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
