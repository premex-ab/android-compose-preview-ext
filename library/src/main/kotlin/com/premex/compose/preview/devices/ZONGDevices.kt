package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZONG device specifications for Android Compose previews.
 *
 * This extension provides ZONG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZONG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZONG: Any
  get() = object {
      /** ZONG Z1 */
      val Z1 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
