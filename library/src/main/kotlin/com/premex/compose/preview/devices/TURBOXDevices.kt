package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TURBO-X device specifications for Android Compose previews.
 *
 * This extension provides TURBO-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TURBOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TURBOX: Any
  get() = object {
      /** TURBO-X tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TURBO-X yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
