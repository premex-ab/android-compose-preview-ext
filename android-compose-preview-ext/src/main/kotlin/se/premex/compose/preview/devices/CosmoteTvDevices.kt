package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COSMOTE-TV device specifications for Android Compose previews.
 *
 * This extension provides COSMOTE-TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CosmoteTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CosmoteTv: Any
  get() = object {
      /** COSMOTE-TV HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
