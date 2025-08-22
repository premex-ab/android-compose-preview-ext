package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EONSmartBox device specifications for Android Compose previews.
 *
 * This extension provides EONSmartBox device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EONSmartBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EONSmartBox: Any
  get() = object {
      /** EONSmartBox CHOTT0102 */
      val CHOTT0102 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EONSmartBox CHSTB02 */
      val CHSTB02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EONSmartBox KNSTB02 */
      val KNSTB02 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
