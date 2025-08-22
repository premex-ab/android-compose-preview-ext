package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BRIGMTON device specifications for Android Compose previews.
 *
 * This extension provides BRIGMTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brigmton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brigmton: Any
  get() = object {
      /** BRIGMTON BTPC-1025OC */
      val BTPC_1025OC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
