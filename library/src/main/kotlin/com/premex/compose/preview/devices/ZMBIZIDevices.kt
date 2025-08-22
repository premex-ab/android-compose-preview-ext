package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZMBIZI device specifications for Android Compose previews.
 *
 * This extension provides ZMBIZI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZMBIZI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZMBIZI: Any
  get() = object {
      /** ZMBIZI ZMBIZI_Z1 */
      val ZMBIZI_Z1 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** ZMBIZI ZMBIZI_Z2 */
      val ZMBIZI_Z2 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
