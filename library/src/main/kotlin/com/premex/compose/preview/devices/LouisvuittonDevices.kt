package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * louisvuitton device specifications for Android Compose previews.
 *
 * This extension provides louisvuitton device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Louisvuitton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Louisvuitton: Any
  get() = object {
      /** louisvuitton ling */
      val LING = "spec:width=390,height=390,unit=px,dpi=320"

      /** louisvuitton sundial */
      val SUNDIAL = "spec:width=390,height=390,unit=px,dpi=320"

  }
