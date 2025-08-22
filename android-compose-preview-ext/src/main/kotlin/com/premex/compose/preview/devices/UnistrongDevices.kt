package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UniStrong device specifications for Android Compose previews.
 *
 * This extension provides UniStrong device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unistrong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unistrong: Any
  get() = object {
      /** UniStrong UT10 */
      val UT10 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** UniStrong UT12 */
      val UT12 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** UniStrong UT30 */
      val UT30 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
