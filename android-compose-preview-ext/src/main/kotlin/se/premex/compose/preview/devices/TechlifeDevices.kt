package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TechLife device specifications for Android Compose previews.
 *
 * This extension provides TechLife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Techlife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Techlife: Any
  get() = object {
      /** TechLife TLPAD001 */
      val TLPAD001 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** TechLife TLPAD002 */
      val TLPAD002 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TechLife TLPADP04 */
      val TLPADP04 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
