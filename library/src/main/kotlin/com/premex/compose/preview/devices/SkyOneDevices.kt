package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY-ONE device specifications for Android Compose previews.
 *
 * This extension provides SKY-ONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyOne.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyOne: Any
  get() = object {
      /** SKY-ONE zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
