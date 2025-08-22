package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CosMedia device specifications for Android Compose previews.
 *
 * This extension provides CosMedia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cosmedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cosmedia: Any
  get() = object {
      /** CosMedia YYT */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
