package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TalkTalk device specifications for Android Compose previews.
 *
 * This extension provides TalkTalk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TalkTalk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TalkTalk: Any
  get() = object {
      /** TalkTalk uzw4054ttg */
      val UZW4054TTG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
