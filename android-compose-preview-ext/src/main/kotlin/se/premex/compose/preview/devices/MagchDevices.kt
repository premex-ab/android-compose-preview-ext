package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAGCH device specifications for Android Compose previews.
 *
 * This extension provides MAGCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Magch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Magch: Any
  get() = object {
      /** MAGCH M210 */
      val M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MAGCH M321 */
      val M321 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAGCH M321-EEA */
      val M321_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAGCH M610 */
      val M610 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAGCH M610-EEA */
      val M610_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAGCH M820 */
      val M820 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** MAGCH M820-EEA */
      val M820_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAGCH M821 */
      val M821 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAGCH M821-EEA */
      val M821_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAGCH T7_Pro */
      val T7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
