package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * efioo device specifications for Android Compose previews.
 *
 * This extension provides efioo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Efioo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Efioo: Any
  get() = object {
      /** efioo efiootabn7a */
      val EFIOOTABN7A = "spec:width=600,height=1024,unit=px,dpi=213"

  }
