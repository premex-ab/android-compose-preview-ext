package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA_EXPLORE_MORE device specifications for Android Compose previews.
 *
 * This extension provides IRA_EXPLORE_MORE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRAEXPLOREMORE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRAEXPLOREMORE: Any
  get() = object {
      /** IRA_EXPLORE_MORE IRAT803 */
      val IRAT803 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IRA_EXPLORE_MORE IRA_BIO */
      val IRA_BIO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** IRA_EXPLORE_MORE IRA_T1029 */
      val IRA_T1029 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
