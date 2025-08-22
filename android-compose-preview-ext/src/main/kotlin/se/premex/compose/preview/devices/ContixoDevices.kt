package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Contixo device specifications for Android Compose previews.
 *
 * This extension provides Contixo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Contixo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Contixo: Any
  get() = object {
      /** Contixo V8_A */
      val V8_A = "spec:width=600,height=1024,unit=px,dpi=160"

  }
