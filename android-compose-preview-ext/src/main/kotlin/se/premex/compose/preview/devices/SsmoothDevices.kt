package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SSmooth device specifications for Android Compose previews.
 *
 * This extension provides SSmooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ssmooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ssmooth: Any
  get() = object {
      /** SSmooth NOVA_6_5 */
      val NOVA_6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SSmooth Smooth5_5_Lite */
      val SMOOTH5_5_LITE = "spec:width=480,height=960,unit=px,dpi=213"

      /** SSmooth Smooth6_1 */
      val SMOOTH6_1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SSmooth Smooth6_26_Lite */
      val SMOOTH6_26_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SSmooth Smooth6_26_Max */
      val SMOOTH6_26_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SSmooth Smooth6_26_Pro */
      val SMOOTH6_26_PRO = "spec:width=720,height=1520,unit=px,dpi=300"

      /** SSmooth Smooth6_5 */
      val SMOOTH6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SSmooth Smooth_5_0_2022 */
      val SMOOTH_5_0_2022 = "spec:width=480,height=854,unit=px,dpi=213"

      /** SSmooth Smooth_5_5_MAX */
      val SMOOTH_5_5_MAX = "spec:width=480,height=960,unit=px,dpi=213"

      /** SSmooth Smooth_6_0 */
      val SMOOTH_6_0 = "spec:width=480,height=960,unit=px,dpi=200"

      /** SSmooth Smooth_8GT */
      val SMOOTH_8GT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SSmooth Smooth_Note_6_8 */
      val SMOOTH_NOTE_6_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SSmooth SMV15523216 */
      val SMV15523216 = "spec:width=480,height=960,unit=px,dpi=200"

      /** SSmooth SSmooth5_5 */
      val SSMOOTH5_5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** SSmooth SSmooth_5 */
      val SSMOOTH_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SSmooth SSmooth_5_HD */
      val SSMOOTH_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SSmooth Vision */
      val VISION = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SSmooth Vision_Plus */
      val VISION_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
