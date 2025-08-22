package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * emporia device specifications for Android Compose previews.
 *
 * This extension provides emporia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Emporia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Emporia: Any
  get() = object {
      /** emporia E5mini */
      val E5MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** emporia E6 */
      val E6 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** emporia E6mini */
      val E6MINI = "spec:width=720,height=1440,unit=px,dpi=320"

      /** emporia E7LT */
      val E7LT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** emporia S3 */
      val S3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** emporia S3mini */
      val S3MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** emporia S4 */
      val S4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** emporia S5 */
      val S5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** emporia SE */
      val SE = "spec:width=480,height=960,unit=px,dpi=240"

      /** emporia TAB1 */
      val TAB1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
