package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ESSENTIELB device specifications for Android Compose previews.
 *
 * This extension provides ESSENTIELB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ESSENTIELB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ESSENTIELB: Any
  get() = object {
      /** ESSENTIELB R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ESSENTIELB R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ESSENTIELB R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ESSENTIELB R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
