package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KLIPAD device specifications for Android Compose previews.
 *
 * This extension provides KLIPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Klipad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Klipad: Any
  get() = object {
      /** KLIPAD KL2018R */
      val KL2018R = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KL2108NBE */
      val KL2108NBE = "spec:width=800,height=1332,unit=px,dpi=160"

      /** KLIPAD KL2109NB_EEA */
      val KL2109NB_EEA = "spec:width=768,height=1366,unit=px,dpi=160"

      /** KLIPAD KL3669A */
      val KL3669A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL3669_EEA */
      val KL3669_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL4889B */
      val KL4889B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KL4889C */
      val KL4889C = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KL4890 */
      val KL4890 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KL4891 */
      val KL4891 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL4898 */
      val KL4898 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KL4898_A50 */
      val KL4898_A50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KL500 */
      val KL500 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KLIPAD KL502 */
      val KL502 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KLIPAD KL503 */
      val KL503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KLIPAD KL505 */
      val KL505 = "spec:width=480,height=854,unit=px,dpi=220"

      /** KLIPAD KL601 */
      val KL601 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KLIPAD KL602 */
      val KL602 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KLIPAD KL605 */
      val KL605 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KLIPAD KL608 */
      val KL608 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KLIPAD KL628KO */
      val KL628KO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KL6889B */
      val KL6889B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL7590 */
      val KL7590 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL7591 */
      val KL7591 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD KL8889 */
      val KL8889 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KL9878 */
      val KL9878 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KL9878AE */
      val KL9878AE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KL9878A_EEA */
      val KL9878A_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KLIPAD KLIPAD */
      val KLIPAD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KLIPAD KLIPAD_KL600 */
      val KLIPAD_KL600 = "spec:width=540,height=960,unit=px,dpi=240"

      /** KLIPAD KLIPAD_KL600B */
      val KLIPAD_KL600B = "spec:width=540,height=960,unit=px,dpi=240"

      /** KLIPAD KLIPAD_SMART_I746 */
      val KLIPAD_SMART_I746 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KLIPAD V355 */
      val V355 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KLIPAD V355B */
      val V355B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KLIPAD V356 */
      val V356 = "spec:width=480,height=960,unit=px,dpi=240"

  }
