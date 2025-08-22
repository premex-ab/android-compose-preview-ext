package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Channel_Master device specifications for Android Compose previews.
 *
 * This extension provides Channel_Master device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ChannelMaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ChannelMaster: Any
  get() = object {
      /** Channel_Master dwt765cha */
      val DWT765CHA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
