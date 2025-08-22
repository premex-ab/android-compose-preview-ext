package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Digicel device specifications for Android Compose previews.
 *
 * This extension provides Digicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digicel: Any
  get() = object {
      /** Digicel DL3PlusPro */
      val DL3PLUSPRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Digicel DL4s_TC */
      val DL4S_TC = "spec:width=480,height=960,unit=px,dpi=200"

      /** Digicel DL4_2022 */
      val DL4_2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Digicel DL4_Plus */
      val DL4_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Digicel DL5_Pro */
      val DL5_PRO = "spec:width=480,height=960,unit=px,dpi=213"

  }
