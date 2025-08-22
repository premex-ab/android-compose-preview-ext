package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Red_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Red_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RedMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RedMobile: Any
  get() = object {
      /** Red_Mobile Quick_5_0 */
      val QUICK_5_0 = "spec:width=480,height=854,unit=px,dpi=240"

  }
