package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * X-TIGI device specifications for Android Compose previews.
 *
 * This extension provides X-TIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTigi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTigi: Any
  get() = object {
      /** X-TIGI A10c */
      val A10C = "spec:width=720,height=1600,unit=px,dpi=300"

      /** X-TIGI A10S */
      val A10S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** X-TIGI A20C */
      val A20C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** X-TIGI A20S */
      val A20S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** X-TIGI A20S_PRO */
      val A20S_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** X-TIGI A3 */
      val A3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** X-TIGI Hope10_Pro */
      val HOPE10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** X-TIGI JOY10_Mate */
      val JOY10_MATE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** X-TIGI JOY8_Mate */
      val JOY8_MATE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** X-TIGI Kids8_Pro */
      val KIDS8_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** X-TIGI Kids9_Pro */
      val KIDS9_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** X-TIGI M20S */
      val M20S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** X-TIGI SHARP1 */
      val SHARP1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** X-TIGI SHARP_2 */
      val SHARP_2 = "spec:width=1080,height=2244,unit=px,dpi=400"

      /** X-TIGI V12 */
      val V12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** X-TIGI V18_pro_A */
      val V18_PRO_A = "spec:width=480,height=854,unit=px,dpi=240"

      /** X-TIGI V28 */
      val V28 = "spec:width=480,height=960,unit=px,dpi=240"

      /** X-TIGI V28_LTE */
      val V28_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** X-TIGI V8 */
      val V8 = "spec:width=480,height=800,unit=px,dpi=240"

      /** X-TIGI X-TIGI_A55 */
      val X_TIGI_A55 = "spec:width=480,height=1120,unit=px,dpi=240"

      /** X-TIGI X-TIGI_JOY7_MAX */
      val X_TIGI_JOY7_MAX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** X-TIGI X-TIGI_V15 */
      val X_TIGI_V15 = "spec:width=480,height=960,unit=px,dpi=240"

      /** X-TIGI X-TIGI_V5 */
      val X_TIGI_V5 = "spec:width=480,height=800,unit=px,dpi=240"

      /** X-TIGI X-TIGI_V9 */
      val X_TIGI_V9 = "spec:width=480,height=800,unit=px,dpi=240"

  }
