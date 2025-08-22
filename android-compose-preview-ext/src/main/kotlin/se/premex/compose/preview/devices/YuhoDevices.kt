package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Yuho device specifications for Android Compose previews.
 *
 * This extension provides Yuho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yuho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yuho: Any
  get() = object {
      /** Yuho Yuho_Tab10 */
      val YUHO_TAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Yuho Yuho_Tab8 */
      val YUHO_TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
