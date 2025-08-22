package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BOTECH device specifications for Android Compose previews.
 *
 * This extension provides BOTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Botech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Botech: Any
  get() = object {
      /** BOTECH HND */
      val HND = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BOTECH R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BOTECH R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BOTECH stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BOTECH zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
