package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GO_MD_USA device specifications for Android Compose previews.
 *
 * This extension provides GO_MD_USA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GoMdUsa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GoMdUsa: Any
  get() = object {
      /** GO_MD_USA X23_Pro */
      val X23_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
