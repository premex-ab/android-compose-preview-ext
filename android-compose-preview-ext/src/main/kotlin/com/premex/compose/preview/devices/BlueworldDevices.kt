package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUEWORLD device specifications for Android Compose previews.
 *
 * This extension provides BLUEWORLD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blueworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blueworld: Any
  get() = object {
      /** BLUEWORLD TM12 */
      val TM12 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
