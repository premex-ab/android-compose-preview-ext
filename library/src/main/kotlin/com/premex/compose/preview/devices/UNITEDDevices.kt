package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNITED device specifications for Android Compose previews.
 *
 * This extension provides UNITED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNITED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNITED: Any
  get() = object {
      /** UNITED gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
