package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZEKI device specifications for Android Compose previews.
 *
 * This extension provides ZEKI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zeki.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zeki: Any
  get() = object {
      /** ZEKI TBQG1031 */
      val TBQG1031 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
