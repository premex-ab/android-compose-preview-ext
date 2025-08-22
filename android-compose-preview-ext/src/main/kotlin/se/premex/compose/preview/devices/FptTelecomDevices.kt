package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FPT_Telecom device specifications for Android Compose previews.
 *
 * This extension provides FPT_Telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FptTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FptTelecom: Any
  get() = object {
      /** FPT_Telecom DV8536-KVF */
      val DV8536_KVF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FPT_Telecom SEI500FPT */
      val SEI500FPT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FPT_Telecom SEI610FPT */
      val SEI610FPT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
