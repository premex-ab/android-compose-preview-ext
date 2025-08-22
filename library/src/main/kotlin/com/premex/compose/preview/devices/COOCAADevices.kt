package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOCAA device specifications for Android Compose previews.
 *
 * This extension provides COOCAA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOCAA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOCAA: Any
  get() = object {
      /** COOCAA YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
