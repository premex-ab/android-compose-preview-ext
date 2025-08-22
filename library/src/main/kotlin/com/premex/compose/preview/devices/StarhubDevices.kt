package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * StarHub device specifications for Android Compose previews.
 *
 * This extension provides StarHub device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starhub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starhub: Any
  get() = object {
      /** StarHub m393vsb_starhub */
      val M393VSB_STARHUB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** StarHub NVSH800H1 */
      val NVSH800H1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
