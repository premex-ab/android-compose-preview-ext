package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Timovi device specifications for Android Compose previews.
 *
 * This extension provides Timovi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Timovi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Timovi: Any
  get() = object {
      /** Timovi Insignia_Delta_2 */
      val INSIGNIA_DELTA_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Timovi Insignia_Lab */
      val INSIGNIA_LAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Timovi Timovi_Infinit_Lite_2 */
      val TIMOVI_INFINIT_LITE_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Timovi Timovi_Infinit_MX */
      val TIMOVI_INFINIT_MX = "spec:width=480,height=854,unit=px,dpi=240"

      /** Timovi Timovi_Vision_PRO */
      val TIMOVI_VISION_PRO = "spec:width=480,height=960,unit=px,dpi=240"

  }
