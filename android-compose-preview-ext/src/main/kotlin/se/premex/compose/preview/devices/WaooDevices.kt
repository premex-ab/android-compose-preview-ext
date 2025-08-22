package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WAOO device specifications for Android Compose previews.
 *
 * This extension provides WAOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Waoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Waoo: Any
  get() = object {
      /** WAOO m393gena_w */
      val M393GENA_W = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
