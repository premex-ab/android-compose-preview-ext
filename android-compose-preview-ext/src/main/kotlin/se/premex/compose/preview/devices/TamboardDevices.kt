package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TAMBOARD device specifications for Android Compose previews.
 *
 * This extension provides TAMBOARD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tamboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tamboard: Any
  get() = object {
      /** TAMBOARD TB_GH */
      val TB_GH = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
