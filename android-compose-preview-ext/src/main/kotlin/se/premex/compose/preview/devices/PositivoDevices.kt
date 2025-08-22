package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Positivo device specifications for Android Compose previews.
 *
 * This extension provides Positivo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Positivo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Positivo: Any
  get() = object {
      /** Positivo G1036 */
      val G1036 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Positivo KC771 */
      val KC771 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Positivo M16QF1XMT8183 */
      val M16QF1XMT8183 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Positivo Q20 */
      val Q20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Positivo S455 */
      val S455 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Positivo S620 */
      val S620 = "spec:width=480,height=1014,unit=px,dpi=280"

      /** Positivo S640 */
      val S640 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** Positivo S650 */
      val S650 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Positivo T1085 */
      val T1085 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Positivo T2050M */
      val T2050M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Positivo T3010D */
      val T3010D = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Positivo T307F */
      val T307F = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Positivo TL10 */
      val TL10 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
