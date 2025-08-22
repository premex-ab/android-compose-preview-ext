package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VERTEX device specifications for Android Compose previews.
 *
 * This extension provides VERTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vertex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vertex: Any
  get() = object {
      /** VERTEX IMPRESS_CLICK */
      val IMPRESS_CLICK = "spec:width=480,height=960,unit=px,dpi=240"

      /** VERTEX Impress_Win */
      val IMPRESS_WIN = "spec:width=720,height=1280,unit=px,dpi=320"

  }
