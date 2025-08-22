package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AngelTech device specifications for Android Compose previews.
 *
 * This extension provides AngelTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Angeltech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Angeltech: Any
  get() = object {
      /** AngelTech E109GCM */
      val E109GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** AngelTech P80 */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
