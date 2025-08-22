package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEON device specifications for Android Compose previews.
 *
 * This extension provides VEON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VEON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VEON: Any
  get() = object {
      /** VEON bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VEON bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VEON SEI103 */
      val SEI103 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VEON SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
