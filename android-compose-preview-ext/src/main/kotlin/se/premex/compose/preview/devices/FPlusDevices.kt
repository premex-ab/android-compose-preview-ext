package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * F-Plus device specifications for Android Compose previews.
 *
 * This extension provides F-Plus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FPlus: Any
  get() = object {
      /** F-Plus R570E */
      val R570E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** F-Plus SA50_21620 */
      val SA50_21620 = "spec:width=480,height=854,unit=px,dpi=200"

      /** F-Plus SA55_21624 */
      val SA55_21624 = "spec:width=480,height=960,unit=px,dpi=200"

      /** F-Plus SH60_23230 */
      val SH60_23230 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** F-Plus SH65_23248 */
      val SH65_23248 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** F-Plus SP65_66440 */
      val SP65_66440 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** F-Plus T1100 */
      val T1100 = "spec:width=1600,height=2176,unit=px,dpi=320"

  }
