package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZITRO device specifications for Android Compose previews.
 *
 * This extension provides ZITRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zitro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zitro: Any
  get() = object {
      /** ZITRO mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ZITRO stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ZITRO zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
