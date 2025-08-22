package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMARFLEX device specifications for Android Compose previews.
 *
 * This extension provides IMARFLEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imarflex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imarflex: Any
  get() = object {
      /** IMARFLEX kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IMARFLEX lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
