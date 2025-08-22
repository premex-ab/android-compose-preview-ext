package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EACRUGGED device specifications for Android Compose previews.
 *
 * This extension provides EACRUGGED device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EACRUGGED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EACRUGGED: Any
  get() = object {
      /** EACRUGGED EP500 */
      val EP500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EACRUGGED RG80 */
      val RG80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EACRUGGED Wolf10R */
      val WOLF10R = "spec:width=800,height=1280,unit=px,dpi=240"

  }
