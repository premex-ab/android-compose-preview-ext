package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * D-Tech device specifications for Android Compose previews.
 *
 * This extension provides D-Tech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTech: Any
  get() = object {
      /** D-Tech D5L */
      val D5L = "spec:width=720,height=1440,unit=px,dpi=300"

      /** D-Tech D5S */
      val D5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** D-Tech LM_01 */
      val LM_01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
