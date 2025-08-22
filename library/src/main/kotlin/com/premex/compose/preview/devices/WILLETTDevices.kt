package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WILLETT device specifications for Android Compose previews.
 *
 * This extension provides WILLETT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WILLETT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WILLETT: Any
  get() = object {
      /** WILLETT tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
