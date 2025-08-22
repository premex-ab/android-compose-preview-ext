package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FASTWD device specifications for Android Compose previews.
 *
 * This extension provides FASTWD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fastwd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fastwd: Any
  get() = object {
      /** FASTWD L231 */
      val L231 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FASTWD L231-EEA */
      val L231_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FASTWD L251-EEA */
      val L251_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FASTWD M109-EEA */
      val M109_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** FASTWD M20L */
      val M20L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FASTWD M518-EEA */
      val M518_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
