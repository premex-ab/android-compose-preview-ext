package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * UNICO device specifications for Android Compose previews.
 *
 * This extension provides UNICO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unico: Any
  get() = object {
      /** UNICO osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
